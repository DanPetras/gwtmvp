/*
 * Copyright 2016 Turn s.r.o.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package sk.turn.gwtmvp.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for views the should load asynchronously and shall not be bundled with compiled source code.
 * The advantage is smaller compiled code footprint, the down side is slower loading times when first 
 * presenting the view (since it needs to load later).
 * 
 * <pre><code>@AsyncView
 *interface MyView extends View&lt;Element&gt; {
 *}</code></pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AsyncView {
}
