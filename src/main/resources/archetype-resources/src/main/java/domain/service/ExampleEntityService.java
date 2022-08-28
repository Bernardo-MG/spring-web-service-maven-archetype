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

package ${package}.domain.service;

import ${package}.domain.model.ExampleEntity;
import ${package}.pagination.model.PageIterable;
import ${package}.pagination.model.Pagination;
import ${package}.pagination.model.Sort;

/**
 * Service for the example entity domain.
 * <p>
 * This is a domain service just to allow the endpoints querying the entities they are asked for.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface ExampleEntityService {

    /**
     * Returns all the entities from the DB.
     *
     * @param pagination
     *            requested page info
     * @param sort
     *            requested sort info
     * @return the persisted entities
     */
    public PageIterable<? extends ExampleEntity> getAll(final Pagination pagination, final Sort sort);

}
