package com.example.tugasakhir_inceahmad_kuliner.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tugasakhir_inceahmad_kuliner.R
import com.example.tugasakhir_inceahmad_kuliner.ui.FoodComponent.FoodCategoriesRow
import com.example.tugasakhir_inceahmad_kuliner.ui.FoodComponent.FoodRecommendationsGrid
import com.example.tugasakhir_inceahmad_kuliner.ui.FoodComponent.SearchBar


@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(
            text = stringResource(title),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(Modifier.padding(8.dp))
        HomeSection(R.string.kategori_menu) {
            FoodCategoriesRow()
        }
        HomeSection(title = R.string.recommendation_menu) {
            FoodRecommendationsGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}