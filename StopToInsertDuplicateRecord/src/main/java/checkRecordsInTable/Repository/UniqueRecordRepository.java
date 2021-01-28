package checkRecordsInTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import checkRecordsInTable.Entity.UniqueRecord;

@Repository
public interface UniqueRecordRepository extends JpaRepository<UniqueRecord, Integer>{

}
