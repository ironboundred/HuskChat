/*
 * This file is part of HuskChat, licensed under the Apache License 2.0.
 *
 *  Copyright (c) William278 <will27528@gmail.com>
 *  Copyright (c) contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.william278.huskchat.velocity.event;

import net.william278.huskchat.event.IChatMessageEvent;
import net.william278.huskchat.player.Player;
import org.jetbrains.annotations.NotNull;

public class ChatMessageEvent extends VelocityEvent implements IChatMessageEvent {
    private Player sender;
    private String message;
    private String channelId;

    public ChatMessageEvent(Player sender, String message, String channelId) {
        this.sender = sender;
        this.message = message;
        this.channelId = channelId;
    }

    @Override
    @NotNull
    public Player getSender() {
        return sender;
    }

    @Override
    @NotNull
    public String getMessage() {
        return message;
    }

    @Override
    @NotNull
    public String getChannelId() {
        return channelId;
    }

    @Override
    public void setSender(@NotNull Player sender) {
        this.sender = sender;
    }

    @Override
    public void setMessage(@NotNull String message) {
        this.message = message;
    }

    @Override
    public void setChannelId(@NotNull String channelId) {
        this.channelId = channelId;
    }
}
