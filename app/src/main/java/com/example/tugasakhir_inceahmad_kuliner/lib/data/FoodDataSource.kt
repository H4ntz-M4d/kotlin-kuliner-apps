package com.example.tugasakhir_inceahmad_kuliner.lib.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tugasakhir_inceahmad_kuliner.R

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

object FoodDataSource {
    val categories: List<DrawableStringPair> = listOf(
        R.drawable.aneka_daging to R.string.aneka_daging,
        R.drawable.aneka_seafood to R.string.seafood,
        R.drawable.aneka_minuman to R.string.minuman,
        R.drawable.khas_daerah to R.string.khas_daerah,
        R.drawable.aneka_dessert to R.string.aneka_dessert
    ).map { DrawableStringPair(it.first, it.second) }

    val recommendation: List<DrawableStringPair> = listOf(
        R.drawable.ikan_bakar to R.string.ikan_bakar,
        R.drawable.ayam_bakar to R.string.ayam_bakar,
        R.drawable.nasi_goreng to R.string.nasi_goreng,
        R.drawable.rendang to R.string.rendang_daging,
        R.drawable.jus_mangga to R.string.jus_mangga,
        R.drawable.puding_coklat_oreo to R.string.puding_coklat_oreo
    ).map { DrawableStringPair(it.first, it.second) }
}

