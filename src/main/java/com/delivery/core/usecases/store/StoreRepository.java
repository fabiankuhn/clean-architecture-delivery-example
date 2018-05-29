package com.delivery.core.usecases.store;

import com.delivery.core.domain.Identity;
import com.delivery.core.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreRepository {
    List<Store> getAll();

    List<Store> searchByName(String searchText);

    Optional<Store> getByIdentity(Identity id);
}
