package net.mcreator.allthesimplechallenges.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME)
public class OTPCommand {

    @SubscribeEvent
    public static void registerCommand(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        
        dispatcher.register(Commands.literal("otp")
            .requires(source -> source.hasPermission(0))
            .then(Commands.argument("target", EntityArgument.player())
                .executes(context -> teleportToPlayer(context, EntityArgument.getPlayer(context, "target"))))
            .then(Commands.argument("pos", BlockPosArgument.blockPos())
                .executes(context -> teleportToPos(context, BlockPosArgument.getLoadedBlockPos(context, "pos"))))
            .executes(context -> {
                context.getSource().sendSystemMessage(Component.translatable("command.otp.usage"));
                return 0;
            })
        );
    }

    private static int teleportToPlayer(CommandContext<CommandSourceStack> context, ServerPlayer target) 
            throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        player.teleportTo(target.serverLevel(), target.getX(), target.getY(), target.getZ(), 
                         target.getYRot(), target.getXRot());
        context.getSource().sendSystemMessage(
            Component.translatable("command.otp.success.player", target.getDisplayName())
        );
        return 1;
    }

    private static int teleportToPos(CommandContext<CommandSourceStack> context, BlockPos pos) 
            throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        player.teleportTo(player.serverLevel(), pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, 
                         player.getYRot(), player.getXRot());
        context.getSource().sendSystemMessage(
            Component.translatable("command.otp.success.pos", 
                String.valueOf(pos.getX()), 
                String.valueOf(pos.getY()), 
                String.valueOf(pos.getZ()))
        );
        return 1;
    }
}