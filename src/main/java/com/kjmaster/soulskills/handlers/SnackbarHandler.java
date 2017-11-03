package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.network.SnackbarPacket;
import net.ilexiconn.llibrary.server.snackbar.Snackbar;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by pbill_000 on 01/09/2017.
 */
public class SnackbarHandler implements IMessageHandler<SnackbarPacket, IMessage> {

    @Override
    public SnackbarPacket onMessage(SnackbarPacket message, MessageContext ctx) {
        String Message = message.text;
        net.ilexiconn.llibrary.server.snackbar.SnackbarHandler.INSTANCE.showSnackbar(Snackbar.create(Message).setDuration(150));
        return null;
    }
}
