package com.example.myfirstapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Univ (
    var name: String,
    var detail: String,
    var photo: Int
) : Parcelable