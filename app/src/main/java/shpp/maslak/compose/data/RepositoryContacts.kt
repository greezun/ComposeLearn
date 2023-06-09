package shpp.maslak.compose.data


import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import shpp.maslak.compose.data.model.Contact
import shpp.maslak.compose.data.model.util.ContactGenerator
import shpp.maslak.compose.data.model.util.ContactManager

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryContacts @Inject constructor(): ContactManager {

    private var _contactList = MutableStateFlow(ContactGenerator().getContacts())
    private val contactList = _contactList.asStateFlow()

    override fun addContact(contact: Contact) {
        _contactList.value = _contactList.value.toMutableList().apply {
            add(contact)
        }
    }

    override fun addContactFromIndex(index: Int, contact: Contact) {
        _contactList.value = _contactList.value.toMutableList().apply {
            if(!contains(contact)) {
                add(index, contact)
            }
        }
    }

    override fun deleteContact(contact: Contact){
        _contactList.value = _contactList.value.toMutableList().apply {
            remove(contact)
        }

    }

    override fun getContact(index: Int): Contact = contactList.value[index]
    override fun getIndex(contact: Contact): Int {
        return _contactList.value.indexOf(contact)
    }

    override fun getContactList():StateFlow<List<Contact>>  = contactList

}