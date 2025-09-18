package com.example1.gamezquitafoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example1.gamezquitafoodapp.ui.theme.GAmezquitaFoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GAmezquitaFoodAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun MainApp(){
    Column(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, top = 40.dp)
            .fillMaxSize()

    ) {
        //HEADER
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            //Icono
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentAlignment = Alignment.Center
            ){
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.Red

                )
            }
            //Letra
            Text("Hola, Gerardo",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp)
                        .weight(1f),

            )
            //Icono salida
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = "Salida",
                modifier = Modifier.size(34.dp),
                tint = Color.Red
            )


        }
        //Nuestras Categorias
        Text("Nuestras categorias",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(top = 20.dp )

        )
        // Lista Categorias
        val categories = listOf("Fast Food", "Chinese","Italian","Mexican","Japanese")
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(top = 25.dp)
        ) {
           items(categories){ categories ->
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier.padding(5.dp)
               ) {
                   Box(
                       modifier = Modifier
                           .size(90.dp)
                           .clip(CircleShape)
                           .background(Color.Red),
                       contentAlignment = Alignment.Center
                   ){

                           Icon(
                               imageVector = Icons.Default.AccountCircle,
                               contentDescription = "Account",

                               modifier = Modifier
                                   .size(40.dp)


                           )


                   }
                   Text(text = categories,
                       modifier = Modifier.padding(8.dp)

                   )



               }
           }
        }
        //Busca Mejores Restaurantes
        Text("Busca los mejores restaurantes",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 10.dp )

        )
        // Restaurantes
        val restaurantes= listOf("Burger King", "McDonald´s","KFC","Pizza Hut","Daddy Queen")
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(top = 25.dp)
        ) {
            items(restaurantes){ restaurantes ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color.Red),
                        contentAlignment = Alignment.Center
                    ){

                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Account",

                            modifier = Modifier
                                .size(40.dp)


                        )


                    }
                    Text(text = restaurantes,
                        modifier = Modifier.padding(8.dp)

                    )



                }
            }
        }
        //Nuestras Mejores Comidas
        Text("Nuestras mejores comidas",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 10.dp )

        )

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_7

)
@Composable
fun GreetingPreview() {
    GAmezquitaFoodAppTheme {
        MainApp()
    }
}