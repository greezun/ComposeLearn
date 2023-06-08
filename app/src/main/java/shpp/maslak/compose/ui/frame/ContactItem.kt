package shpp.maslak.compose.ui.frame


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import shpp.maslak.compose.R
import shpp.maslak.compose.data.model.Contact

@Composable
fun ContactItem (contact: Contact){
     Card(
         modifier = Modifier.fillMaxWidth()
             .padding(8.dp)

     ){
         Row{
             Image(
                 painter = painterResource(id = R.drawable.horse),
                 contentDescription = "Contact profile picture",

                 modifier = Modifier
                     // Set image size to 40 dp
                     .size(40.dp)
                     // Clip image to be shaped as a circle
                     .clip(CircleShape)





             )
             Spacer(modifier = Modifier.width(8.dp))

             Column {
                 Text(text = contact.userName)
                 // Add a vertical space between the author and message texts
                 Spacer(modifier = Modifier.height(4.dp))
                 Text(text = contact.career)
             }

         }
     }
}