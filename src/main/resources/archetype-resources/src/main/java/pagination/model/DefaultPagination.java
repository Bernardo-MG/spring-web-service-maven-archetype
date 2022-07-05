/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) ${currentYear} the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ${package}.pagination.model;

import lombok.Data;
import lombok.NonNull;

/**
 * Default implementation of the paginated data request.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
@Data
public final class DefaultPagination implements Pagination {

    /**
     * Page index to read.
     */
    @NonNull
    private final Integer page;

    /**
     * Always paged.
     */
    @NonNull
    private final Boolean paged = true;

    /**
     * Number of elements to read per page.
     */
    @NonNull
    private final Integer size;

    /**
     * Builds a pagination request with the specified data.
     * 
     * @param pg page index
     * @param sz page size
     */
    public DefaultPagination(@NonNull final Integer pg,
            @NonNull final Integer sz) {
        super();

        page = pg;
        size = sz;
    }

}
