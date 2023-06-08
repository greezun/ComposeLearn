package shpp.maslak.compose.ui.frame


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import shpp.maslak.compose.R
import shpp.maslak.compose.ui.theme.DarkBlue
import shpp.maslak.compose.ui.theme.GrayText2
import shpp.maslak.compose.ui.theme.Orange
import java.util.Locale

@Preview
@Composable
fun MyProfile() {
    Column {
        Box(
            modifier = Modifier
                .background(color = DarkBlue)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        )
        {
            Text(
                text = "Setting",
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.horse),
                    contentDescription = "Contact profile picture",

                    modifier = Modifier
                        .padding(top = 70.dp)
                        // Set image size to 40 dp
                        .size(113.dp)
                        // Clip image to be shaped as a circle
                        .clip(CircleShape)
                )

                Text(
                    text = "User name",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 24.dp)
                )

                Text(
                    text = "Career",
                    color = GrayText2,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Home address",
                    color = GrayText2,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

        }

        Box(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 64.dp),

                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.image_fb),
                        contentDescription = "FB"
                    )
                    Image(
                        painter = painterResource(id = R.drawable.image_insta),
                        contentDescription = "Insta"
                    )
                    Image(
                        painter = painterResource(id = R.drawable.imagelinked_in),
                        contentDescription = "LI"
                    )
                }

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(40.dp)
                        .padding(start = 16.dp, end = 16.dp, top = 94.dp),
                    border = BorderStroke(width = 2.dp, color = DarkBlue),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    content = {
                        Text(text = "Edit profile")
                    }


                )
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding( 16.dp)
                        .fillMaxWidth()
                        .height(55.dp),

                    colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
                    content = {
                        Text(
                            text = "view my contacts".uppercase(),
                            color = Color.White
                        )
                    }

                )
            }

        }
    }
}