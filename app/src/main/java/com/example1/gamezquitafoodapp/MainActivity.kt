package com.example1.gamezquitafoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
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
                    MainApp()
                }
            }
        }
    }
}

data class BrandItem(val name: String, val image: Int)
data class BrandItems(val name: String, val image: Int)
data class FoodItem(val name: String, val image: Int, val rating: Double, val price: Double)


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
        // Categorias
        val categorias = listOf(
            BrandItems("Fast Food", R.drawable.comidara),
            BrandItems("Chinese", R.drawable.comidachi),
            BrandItems("Italian", R.drawable.comidaita),
            BrandItems("Mexican", R.drawable.comidamex),
            BrandItems("Japanese", R.drawable.comidaja),
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(top = 25.dp)
        ) {
            items(categorias){ item ->
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

                        Image(
                            painter = painterResource(id = item.image),
                            contentDescription = item.name,
                            modifier = Modifier.size(90.dp)
                        )


                    }
                    Text(text = item.name,
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


        val restaurantes = listOf(
            BrandItem("KFC", R.drawable.kfclaila),
            BrandItem("Burger King", R.drawable.burgerking),
            BrandItem("McDonald's", R.drawable.mcdonalds),
            BrandItem("Pizza Hut", R.drawable.hutpizza),
            BrandItem("Dairy Queen", R.drawable.dairyqueen),
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(top = 25.dp)
        ) {
            items(restaurantes){ item ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ){

                        Image(
                            painter = painterResource(id = item.image),
                            contentDescription = item.name,
                            modifier = Modifier.size(90.dp)
                        )


                    }
                    Text(text = item.name,
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
        //Lista de nuestras mejores comidas
        val comidas = listOf(
            FoodItem("Whopper", R.drawable.whopper, 4.5, 99.8),
            FoodItem("Chicken Fries", R.drawable.chickenfries, 4.3, 59.8),
            FoodItem("Big Mac", R.drawable.bigmac, 4.6, 79.8),

        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            items(comidas) { comida ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = comida.image),
                        contentDescription = comida.name,
                        modifier = Modifier
                            .size(100.dp)
                    )

                    // Precio en botoncito rojo
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFE74C3C))
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Text(
                            text = "$${comida.price}",
                            color = Color.White
                        )
                    }

                    // Estrellita + rating
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "★", color = Color(0xFFFFD700))
                        Text(text = comida.rating.toString())
                    }

                    Text(text = comida.name)
                }
            }
        }
        //Otro LazyRow
        val comidas2 = listOf(
            FoodItem("McFlurry", R.drawable.mcflurry, 4.7, 49.8),
            FoodItem("Nuggets", R.drawable.nuggets, 4.3, 69.8)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            items(comidas2) { comida ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = comida.image),
                        contentDescription = comida.name,
                        modifier = Modifier
                            .size(100.dp)
                    )

                    // Precio en botoncito rojo
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFE74C3C))
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Text(
                            text = "$${comida.price}",
                            color = Color.White
                        )
                    }

                    // Estrellita + rating
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "★", color = Color(0xFFFFD700))
                        Text(text = comida.rating.toString())
                    }

                    Text(text = comida.name)
                }
            }
        }



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