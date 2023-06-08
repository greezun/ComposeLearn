package shpp.maslak.compose.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import shpp.maslak.compose.data.RepositoryContacts
import shpp.maslak.compose.data.model.util.ContactManager

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindContactManager(
        manager: RepositoryContacts
    ): ContactManager

//    @Binds
//    abstract fun bindUserRepository(
//        userRepositoryImpl: UserRepositoryImpl
//    ): UserRepository
}