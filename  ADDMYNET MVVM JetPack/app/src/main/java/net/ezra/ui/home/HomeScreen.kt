package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME


import net.ezra.R


@Composable
fun HomeScreen(navController: NavHostController) {
    Box (modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize()
        .background(color = Color.Black)
        .padding(50.dp),
        contentAlignment = Alignment.Center){


//        Image(painter = painterResource(id = R.drawable.xx) , contentDescription = "",
//            modifier = Modifier
//                .fillMaxSize(),
//            contentScale = ContentScale.Crop)




        Column(



            modifier = Modifier
//                .fillMaxSize()
////                .fillMaxWidth()
////                .wrapContentHeight()
//                .padding(50.dp)
////                .padding(top = 0.dp)

        ){

            Image(
                painter = painterResource(id = R.drawable.pic),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier
                .height(50.dp))




//            Text(text = stringResource(id = R.string.mit))

            Text(text = "Manage your financial future", color = Color(0xff209fbe ), fontSize = 30.sp)
            Row {
                Text(text = "A reliable tool to manage your personal finance", color = Color(0xff209fbe ), fontSize = 10.sp)
            }
            Row {

                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )

                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )




            }



            Spacer(modifier = Modifier
                .height(20.dp))
            Button(onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_ABOUT) { inclusive = true }
                }
            },
                colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
            )


            {

                Text(text = "Get started",color= Color.Black)

                Image(
                    painter = painterResource(id = R.drawable.aro),
                    contentDescription = "",
                    modifier = Modifier
                        .background(color = Color(0xff209fbe))
                        .size(20.dp)
                        .clip(shape = CircleShape)


                )

            }




//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_ABOUT) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "about"
//            )


//
//






        }
    }







}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

