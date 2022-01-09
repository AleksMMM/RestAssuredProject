package restPojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Request{
	private String method;
	private String description;
	private String url;
	private List<HeaderItem> header;
	private Body body;
}