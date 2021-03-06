/*
 *
 * Copyright (c) 2014-2020, yugenhai108@gmail.com.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 */


package io.shixinyangyy.core.request;

/**
 * @author Shixinyangyy
 */
public interface RequestHeaderProvider {

    String REQUEST_ID_KEY           = "Request-Id";
    String CONTEXT_MAP              = "Context-Map";
    String TIMESTAMP                = "Time-Stamp";
    String HEADER_PREFIX            = "X-Shixinyangyy-Header-";
}
