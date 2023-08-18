package com.eespinor.dropdownmenu

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eespinor.dropdownmenu.ui.theme.DropDownMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DropDownMenuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(16.dp)
                    ) {
                        items(
                            listOf(
                                "Gloria",
                                "Gabriel",
                                "Estrella",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                                "Edgard",
                            )
                        ) { name ->
                            PersonItem(
                                personName = name,
                                dropdownInt =
                                listOf(
                                    DropDownItem("Item 1"),
                                    DropDownItem("Item 2"),
                                    DropDownItem("Item 3")
                                ), onItemClick = {
                                    Toast.makeText(applicationContext, it.text, Toast.LENGTH_SHORT)
                                        .show()
                                }
                            )

                        }
                    }
                }
            }
        }
    }
}