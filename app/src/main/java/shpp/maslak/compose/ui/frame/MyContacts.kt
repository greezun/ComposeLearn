package shpp.maslak.compose.ui.frame


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items


import androidx.compose.runtime.Composable

import shpp.maslak.compose.data.model.Contact




@Composable
fun ShowMyContacts(contactsList:List<Contact>){
    LazyColumn {
        items(contactsList) { contact ->
            ContactItem(contact)
        }
    }

}