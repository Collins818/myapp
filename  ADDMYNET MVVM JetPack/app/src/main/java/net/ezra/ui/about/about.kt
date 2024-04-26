package net.ezra.ui.about

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.media.RouteListingPreference.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.ui.theme.AppTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {

Box(modifier = Modifier
//
    .fillMaxSize()
    .fillMaxWidth()
    .background(color = Color.Black)){

    LazyColumn {

        item {
            Column (modifier = Modifier
                .padding(20.dp)){

//                val mContext = LocalContext.current
                TopAppBar(




                    title = {
                        Text(
                            text = "MYNETapp",
                            color = Color(0xff1f6d80 ),
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp

                        )
                    },


                    actions = {
                        Image(
                            painter = painterResource(id = R.drawable.mi),
                            contentDescription ="High 2",
                            modifier = Modifier
                                .background(color = Color.Black)
                                .size(15.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_HOME) {
                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                    }
                                },


                            text = "",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier
                            .width(10.dp))


                        Image(
                            painter = painterResource(id = R.drawable.set),
                            contentDescription ="High 2",
                            modifier = Modifier

                                .size(15.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )


                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_HOME) {
                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                    }




                                },


                            text = "",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier
                            .width(10.dp))


                        Image(
                            painter = painterResource(id = R.drawable.sha),
                            contentDescription ="High 2",
                            modifier = Modifier

                                .size(15.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )


                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_HOME) {
                                        popUpTo(ROUTE_ABOUT) { inclusive = true }

                                    }




                                },


                            text = "",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )






//
//

                    }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black)
                )
//









                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_HOME) {
                                popUpTo(ROUTE_ABOUT) { inclusive = true }

                            }
                        },


                    text = "APPS",
                    textAlign = TextAlign.Center,
                    color = Color(0xff1f6d80)
                )
                Spacer(modifier = Modifier
                    .height(10.dp))
               
               Row {
                   Column {
                       Card (modifier = Modifier
                           .height(90.dp)
                           .width(140.dp)
                           .padding(10.dp),
                           colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                           elevation = CardDefaults.cardElevation(10.dp)


                       ){
                           Box(modifier = Modifier.fillMaxWidth()) {
                               Image(
                                   painter = painterResource(id = R.drawable.it),
                                   contentDescription = "germany",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.Crop
                               )

                               Icon(
                                   imageVector = Icons.Default.Favorite,
                                   contentDescription = "favorite",
                                   tint = Color.Red,
                                   modifier = Modifier
                                       .align(Alignment.TopEnd)
                                       .padding(10.dp)
                               )










                           }


                       }

                       Text(
                           modifier = Modifier

                               .clickable {
                                   navController.navigate(ROUTE_ABOUT) {
                                       popUpTo(ROUTE_MIT) { inclusive = true }

                                   }
                               },


                           text = "GAMES",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Cursive,
                           textAlign = TextAlign.Center,
                           color = Color(0xffffffff  )
                       )



                   }


                   Spacer(modifier = Modifier
                       .width(60.dp))











                   Card (modifier = Modifier
                       .height(90.dp)
                       .width(140.dp)
                       .padding(10.dp),
                       colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                       elevation = CardDefaults.cardElevation(10.dp)


                   ){
                       Box(modifier = Modifier.fillMaxWidth()) {
                           Image(
                               painter = painterResource(id = R.drawable.xxx),
                               contentDescription = "germany",
                               modifier = Modifier.fillMaxSize(),
                               contentScale = ContentScale.Crop
                           )

                           Icon(
                               imageVector = Icons.Default.Favorite,
                               contentDescription = "favorite",
                               tint = Color.Red,
                               modifier = Modifier
                                   .align(Alignment.TopEnd)
                                   .padding(10.dp)
                           )
                           Text(
                               modifier = Modifier

                                   .clickable {
                                       navController.navigate(ROUTE_ABOUT) {
                                           popUpTo(ROUTE_MIT) { inclusive = true }

                                       }
                                   },


                               text = "social media",
                               fontSize = 20.sp,
                               fontFamily = FontFamily.Cursive,
                               textAlign = TextAlign.Center,
                               color = Color(0xffffffff  )
                           )



                       }
                   }
                   Spacer(modifier = Modifier
                       .height(10.dp))







               }















            }


        }


    }






}






}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

