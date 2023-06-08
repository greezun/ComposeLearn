package shpp.maslak.compose


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.mutableStateOf

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle

import kotlinx.coroutines.launch
import shpp.maslak.compose.data.model.Contact

import shpp.maslak.compose.ui.frame.ContactsViewModel
import shpp.maslak.compose.ui.frame.MyProfile

import shpp.maslak.compose.ui.theme.ComposeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
              MyProfile()
            }
        }

    }


}



