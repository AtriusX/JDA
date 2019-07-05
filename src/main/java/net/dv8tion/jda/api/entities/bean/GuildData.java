/*
 * Copyright 2015-2019 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.entities.bean;

import net.dv8tion.jda.api.entities.Guild;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface GuildData
{
    GuildData copy();

    @Nullable
    String getIconId();
    @Nullable
    String getSplashId();
    @Nullable
    String getDescription();
    @Nullable
    String getBannerId();
    @Nonnull
    Guild.BoostTier getBoostTier();
    int getBoostCount();
    int getMaxMembers();
    int getMaxPresences();
    long getAfkChannelId();
    long getSystemChannelId();
    @Nonnull
    Guild.Timeout getAfkTimeout();
    @Nonnull
    Guild.VerificationLevel getVerificationLevel();
    @Nonnull
    Guild.NotificationLevel getNotificationLevel();
    @Nonnull
    Guild.MFALevel getMFALevel();
    @Nonnull
    Guild.ExplicitContentLevel getExplicitContentLevel();
    @Nonnull
    String getRegion();
}
