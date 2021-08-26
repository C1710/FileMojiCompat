package de.c1710.filemojicompat_ui.packs

import android.content.Context
import android.net.Uri
import androidx.core.content.res.ResourcesCompat
import de.c1710.filemojicompat_ui.R
import de.c1710.filemojicompat_ui.helpers.EmojiPreference
import de.c1710.filemojicompat_ui.helpers.Version
import de.c1710.filemojicompat_ui.structures.EmojiPackList

class CustomEmojiPack(
    context: Context,
    hash: String
): FileBasedEmojiPack (
    hash,
    EmojiPreference.getNameForCustom(context, hash) ?: hash,
    "",
    ResourcesCompat.getDrawable(context.resources, R.drawable.ic_custom_emojis, context.theme),
    null as Version?,
    null as Uri?,
    null as Uri?,
    context.resources.getString(R.string.custom_emoji)
) {
    override fun isCurrentVersion(list: EmojiPackList): Boolean = true

}