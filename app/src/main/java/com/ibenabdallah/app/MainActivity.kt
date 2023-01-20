package com.ibenabdallah.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ibenabdallah.app.ui.theme.IIndicatorsTheme
import com.ibenabdallah.app.ui.theme.PurpleGrey40
import com.ibenabdallah.app.ui.theme.UIScreen
import com.ibenabdallah.iindicators.Indicators

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IIndicatorsTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() = UIScreen {

        var selectedPage by remember { mutableStateOf(0) }
        val count = 7

        Box(modifier = Modifier.fillMaxSize()) {
            Indicators(
                count = count,
                size = 10,
                spacer = 5,
                selectedColor = Color.Red,
                unselectedColor = PurpleGrey40,
                modifier = Modifier.align(Alignment.Center),
                selectedIndex = selectedPage,
                selectedLength = 50
            )

            Button(
                onClick = {
                    if (selectedPage != 0) selectedPage-- else selectedPage = (count - 1)
                },
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(24.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back_24),
                    contentDescription = ""
                )
            }

            Button(
                onClick = {
                    if (selectedPage != (count - 1)) selectedPage++ else selectedPage = 0
                },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(24.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_forward_24),
                    contentDescription = ""
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    IIndicatorsTheme {
        MainScreen()
    }
}