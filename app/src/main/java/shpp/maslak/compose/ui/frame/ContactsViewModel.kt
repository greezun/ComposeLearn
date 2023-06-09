package shpp.maslak.compose.ui.frame


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import shpp.maslak.compose.data.model.Contact
import shpp.maslak.compose.data.model.util.ContactManager

import javax.inject.Inject

@HiltViewModel
class ContactsViewModel @Inject constructor( private val manager: ContactManager) : ViewModel() {


    private var _contactList = MutableStateFlow<List<Contact>>(emptyList())
    val contactState = _contactList

    private var _selectedContactsList = MutableStateFlow<List<Contact>>(emptyList())
    val  multiselectMode: StateFlow<List<Contact>> = _selectedContactsList

    init {
        viewModelScope.launch {
            manager.getContactList().collectLatest { contactList ->
                _contactList.value = contactList

            }
        }

    }

    fun addContactOnIndex(index: Int, contact: Contact) {
        manager.addContactFromIndex(index, contact)

    }

    fun getContact(index: Int) = manager.getContact(index)
    fun deleteContact(contact: Contact){
        return manager.deleteContact(contact)
    }

    fun getIndex(contact: Contact): Int = manager.getIndex(contact)

    fun changeSelectedList(contact: Contact){
        _selectedContactsList.value = _selectedContactsList.value.toMutableList().apply {
            if(contact.isSelected){
                add(contact)
            } else{
                remove(contact)
            }

        }
    }
    fun deleteSelected() {
        _contactList.value = _contactList.value.toMutableList().filter { !it.isSelected }
        _selectedContactsList.value = emptyList()
    }



}