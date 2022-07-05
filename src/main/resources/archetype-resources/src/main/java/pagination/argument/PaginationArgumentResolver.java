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

package ${package}.pagination.argument;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import ${package}.pagination.model.DefaultPagination;
import ${package}.pagination.model.DisabledPagination;
import ${package}.pagination.model.Pagination;

import lombok.extern.slf4j.Slf4j;

/**
 * Argument resolver for pagination data.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
@Slf4j
public final class PaginationArgumentResolver
        implements HandlerMethodArgumentResolver {

    /**
     * Default size.
     */
    private static final Integer DEFAULT_SIZE = 20;

    /**
     * Default constructor.
     */
    public PaginationArgumentResolver() {
        super();
    }

    @Override
    public final Pagination resolveArgument(final MethodParameter parameter,
            final ModelAndViewContainer mavContainer,
            final NativeWebRequest webRequest,
            final WebDataBinderFactory binderFactory) throws Exception {
        final String rawPage;
        final String sizeText;
        final Integer page;
        final Integer size;
        final Pagination pagination;

        rawPage = webRequest.getParameter("page");

        if (rawPage == null) {
            // No pagination
            pagination = new DisabledPagination();
            log.trace("No pagination received, using disabled pagination");
        } else {
            page = Integer.valueOf(rawPage);
            sizeText = webRequest.getParameter("size");
            if (sizeText == null) {
                // No size
                size = DEFAULT_SIZE;
                log.trace("No size received, using default page size: {}",
                    size);
            } else {
                size = Integer.valueOf(sizeText);
            }
            log.trace("Building page {} with size {}", page, size);
            pagination = new DefaultPagination(page, size);
        }

        return pagination;
    }

    @Override
    public final boolean supportsParameter(final MethodParameter parameter) {
        return Pagination.class.equals(parameter.getParameterType());
    }

}
