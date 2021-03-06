package net.dongliu.requests.body;

import net.dongliu.requests.InternalIOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import static net.dongliu.requests.HttpHeaders.CONTENT_TYPE_BINARY;

/**
 * @author Liu Dong
 */
class InputStreamRequestBody extends RequestBody<InputStream> {
    InputStreamRequestBody(InputStream body) {
        super(body, CONTENT_TYPE_BINARY, false);
    }

    @Override
    public void writeBody(OutputStream os, Charset charset) throws IOException {
        InternalIOUtils.copy(getBody(), os);
    }
}
