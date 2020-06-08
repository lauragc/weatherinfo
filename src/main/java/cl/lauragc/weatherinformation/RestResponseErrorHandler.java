package cl.lauragc.weatherinformation;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class RestResponseErrorHandler implements ResponseErrorHandler {

		@Override
		public void handleError(ClientHttpResponse httpResponse) throws IOException {
			if (httpResponse.getStatusCode()
			          .series() == HttpStatus.Series.SERVER_ERROR) {
			            // handle SERVER_ERROR
			        } else if (httpResponse.getStatusCode()
			          .series() == HttpStatus.Series.CLIENT_ERROR) {
			            // handle CLIENT_ERROR
			        }
		}
		@Override
		public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
			return (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
			          || httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
		}
}
