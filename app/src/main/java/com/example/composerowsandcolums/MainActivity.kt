package com.example.composerowsandcolums

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composerowsandcolums.ui.theme.ComposeRowsAndColumsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRowsAndColumsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ExpandableCard("My Title","Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                            "ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier.fillMaxSize().
    padding(10.dp),
    horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Card(
            modifier = Modifier
                .padding(8.dp, 4.dp)
                .fillMaxWidth()
                .height(200.dp), shape = RoundedCornerShape(8.dp), elevation = 4.dp

        ) {
            Surface(
                color = Color.Green
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxSize()

                ) {
                    Text(
                        text = "knkn",
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "kjnnj",
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier
                            .background(Color.LightGray)
                            .padding(4.dp)
                    )
                    Text(
                        text = "jkjkj",
                        style = MaterialTheme.typography.body1,
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .padding(8.dp, 4.dp)
                .fillMaxWidth()
                .height(50.dp), shape = RoundedCornerShape(8.dp), elevation = 4.dp

        ) {
            Surface(
                color = Color.Green
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier
                        .padding(80.dp)
                        .fillMaxSize()

                ) {
                    Text(
                        text = "knkn",
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "kjnnj",
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier
                            .background(Color.LightGray)
                            .padding(4.dp)
                    )
                    Text(
                        text = "jkjkj",
                        style = MaterialTheme.typography.body1,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeRowsAndColumsTheme {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround) {
            Surface(
                modifier= Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary) {

            }
            Surface(
                modifier= Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary) {

            }
            Surface(
                modifier= Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary) {

            }
            Surface(
                modifier= Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary) {

            }
        }
    }
}