/*
 * Developed by Vibert Bounyasit
 * Last modified 9/15/19 12:42 PM
 *
 * Copyright (c) 2019-present. All right reserved.
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

package com.vbounyasit

import com.vbounyasit.bigdata.SparkApplication.ApplicationConfData
import com.vbounyasit.bigdata.exceptions.ExceptionHandler
import com.vbounyasit.bigdata.transform.ExecutionPlan
import com.vbounyasit.bigdata.transform.pipeline.impl.SourcePipeline
import pureconfig.error.ConfigReaderFailures

package object bigdata {

  type Sources = Map[String, SourcePipeline]
  type ExecutionPlans = Map[String, ExecutionPlan]
  type EitherRP = Either[ExceptionHandler, SourcePipeline]
  type ApplicationConf[T] = Option[ApplicationConfData[T]]
  type PureConfigLoaded[T] = Either[ConfigReaderFailures, T]

  case class DatePattern(pattern: String)

  val datePattern = DatePattern("yyyy-MM-dd")
}
