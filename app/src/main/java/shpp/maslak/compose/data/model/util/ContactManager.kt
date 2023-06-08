package shpp.maslak.compose.data.model.util


import kotlinx.coroutines.flow.StateFlow
import shpp.maslak.compose.data.model.Contact


interface ContactManager  {

    fun addContact (contact: Contact)
    fun addContactFromIndex(index: Int, contact: Contact)
    fun deleteContact(contact: Contact)
    fun getContact(index: Int): Contact
    fun getIndex (contact: Contact) : Int

    fun getContactList(): StateFlow<List<Contact>>
}