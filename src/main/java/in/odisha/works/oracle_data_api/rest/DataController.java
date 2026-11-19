package in.odisha.works.oracle_data_api.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.odisha.works.oracle_data_api.data.Data;

@RestController
@EnableAutoConfiguration
public class DataController {

	@RequestMapping("/")
	public Data  get() {
		return new Data(1L, "Jane Doe");
	}
}
