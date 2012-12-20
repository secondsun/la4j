/*
 * Copyright 2011-2013, by Vladimir Kostyukov and Contributors.
 * 
 * This file is part of la4j project (http://la4j.org)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributor(s): -
 * 
 */

package org.la4j.io;

import java.io.InputStream;
import java.io.OutputStream;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MatrixMarketStreamTest extends AbstractStreamTest {

    @Override
    public AbstractStream stream(InputStream in) {
        return new MatrixMarketStream(in);
    }

    @Override
    public AbstractStream stream(OutputStream out) {
        return new MatrixMarketStream(out);
    }

    public static Test suite() {
        return new TestSuite(MatrixMarketStreamTest.class);
    }
}