package org.yugh.coral.event.boot.daos;

import org.springframework.data.repository.CrudRepository;
import org.yugh.coral.event.boot.domain.MerchandiseEntity;

public interface InventoryRepository extends CrudRepository<MerchandiseEntity, Long> {
}
