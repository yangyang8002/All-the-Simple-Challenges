package net.mcreator.allthesimplechallenges.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Relative;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

import java.util.EnumSet;

@EventBusSubscriber(modid = "allthesimplechallenges") // 请替换为您的实际 modid
public class OTPCommand {

    @SubscribeEvent
    public static void registerCommand(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(Commands.literal("otp")
            .then(Commands.argument("target", EntityArgument.player())
                .executes(context -> teleportToPlayer(context, EntityArgument.getPlayer(context, "target"))))
            .then(Commands.argument("pos", BlockPosArgument.blockPos())
                .executes(context -> teleportToPos(context, BlockPosArgument.getBlockPos(context, "pos"))))
            .executes(context -> {
                context.getSource().sendFailure(Component.literal("Usage: /otp <player> or /otp <x y z>"));
                return 0;
            })
        );
    }

    private static int teleportToPlayer(CommandContext<CommandSourceStack> context, ServerPlayer target)
            throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        // 使用 target.level() 并强制转换为 ServerLevel
        player.teleportTo(
            (ServerLevel) target.level(),
            target.getX(),
            target.getY(),
            target.getZ(),
            EnumSet.noneOf(Relative.class),
            target.getYRot(),
            target.getXRot(),
            false
        );
        context.getSource().sendSuccess(
            () -> Component.literal("Teleported you to " + target.getDisplayName().getString() + "."),
            true
        );
        return 1;
    }

    private static int teleportToPos(CommandContext<CommandSourceStack> context, BlockPos pos)
            throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        // 使用 player.level() 并强制转换
        player.teleportTo(
            (ServerLevel) player.level(),
            pos.getX() + 0.5,
            pos.getY() + 1.0,
            pos.getZ() + 0.5,
            EnumSet.noneOf(Relative.class),
            player.getYRot(),
            player.getXRot(),
            false
        );
        context.getSource().sendSuccess(
            () -> Component.literal(String.format("Teleported you to %d, %d, %d.", pos.getX(), pos.getY(), pos.getZ())),
            true
        );
        return 1;
    }
}