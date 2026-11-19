package in.odisha.works.oracle_data_api.data;

public class Data {
	private Long id;
    private String name;

    public Data(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
