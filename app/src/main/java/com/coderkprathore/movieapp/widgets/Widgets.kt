package com.coderkprathore.movieapp.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.coderkprathore.movieapp.model.Movie
import com.coderkprathore.movieapp.model.getMovies

@OptIn(ExperimentalAnimationApi::class)
@Preview
@Composable
fun MovieRow(movie : Movie = getMovies()[0],
             onItemClick: (String) -> Unit = {}) {

    var expanded by remember {
        mutableStateOf(false)
    }
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        //.height(130.dp)
        .clickable {
            onItemClick(movie.id)

        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp) {

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp),
                shape = RectangleShape,
                elevation = 4.dp) {
                Image(painter = rememberImagePainter(data =movie.image[0],
                    builder = {
                        crossfade(true)
                        transformations(CircleCropTransformation())
                    }),
                    contentDescription = "Movie Poster")

                // Old Code For Image Link Sync Through Coil
//                    Image(painter = rememberImagePainter(data = movie.image[0]),
//                        contentDescription ="Movie Poster")

                //Icon(imageVector = Icons.Default.AccountBox,
                  //  contentDescription = "Movie Image" )

            }
            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = movie.title,
                    style = MaterialTheme.typography.h6)
                Text(text = "Director: ${movie.director}" ,
                    style = MaterialTheme.typography.caption)
                Text(text = "Released : ${movie.year}",
                    style = MaterialTheme.typography.caption)
                
                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text(text = "Actors : ${movie.actors}",
                            style = MaterialTheme.typography.caption)

                        Divider(modifier = Modifier.padding(3.dp))
                        
                        Text(buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp)){
                                append("Premiere Date: ")

                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                            )){
                                append(movie.year)

                            }


                        }, modifier = Modifier.padding(6.dp))
                        Divider()
                        Text(buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp)){
                                append("Genre: ")

                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                            )){
                                append(movie.genre)

                            }


                        })

                    }
                    
                }
                

                
                Icon(imageVector =if(expanded) Icons.Filled.KeyboardArrowUp else
                    Icons.Filled.KeyboardArrowDown,
                    contentDescription = "Down Arrow",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {

                            expanded = !expanded

                        },
                    tint = Color.DarkGray
                )
                
            }

        }



    }
}