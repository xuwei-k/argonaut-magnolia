/*
 * Copyright 2018 Matt Searle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package argonaut.magnolia.hinted.derive

import adt._
import argonaut.Argonaut._
import argonaut._
import utest._
import EncodeJsonTool._

object EncodeJsonToolTest extends TestSuite {

  val tests = Tests {
    'test - {
      'Empty - {
        assert(Empty.asJson == Json.obj())
      }

      'EmptyCC - {
        assert(EmptyCC().asJson == Json.obj())
      }
    }
  }

}