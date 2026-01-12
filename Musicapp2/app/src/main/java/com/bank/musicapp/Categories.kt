package com.bank.musicapp

import androidx.annotation.DrawableRes

data class Categorie(val name : String,@DrawableRes val res : Int)

val LibItem = listOf(
    Categorie("Play List",R.drawable.outline_list),
    Categorie("Artists",R.drawable.outline_mic_24),
    Categorie("Album",R.drawable.outline_album_24),
    Categorie("Songs",R.drawable.outline_music_note_24),
    Categorie("Genre",R.drawable.outline_view_list_24)
)
val BrowseItem = listOf(
    Categorie("Workout",R.drawable.outline_directions_workout),
    Categorie("Running",R.drawable.outline_sports_gymnastic),
    Categorie("Hit",R.drawable.outline_kid_star_24),
    Categorie("Yoga",R.drawable.outline_favorite_24),
    Categorie("TGIF",R.drawable.outline_feature_search_24)
)

//Hits","Happy","Workout","Running","TGIF","Yoga