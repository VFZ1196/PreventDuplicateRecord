package checkRecordsInTable.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import checkRecordsInTable.Entity.UniqueRecord;
import checkRecordsInTable.Repository.UniqueRecordRepository;

@RestController
public class UniqueRecordController {
	
	@Autowired
	private UniqueRecordRepository recordRepository;
	
	@PostMapping("/unique")
	public UniqueRecord saveRecordAfterCheck(@RequestBody UniqueRecord uniqueRecord) {
		return recordRepository.save(uniqueRecord);
	}
	
	@GetMapping("/unique")
	public List<UniqueRecord> getAllRecords() {
		return recordRepository.findAll();
	}

}
