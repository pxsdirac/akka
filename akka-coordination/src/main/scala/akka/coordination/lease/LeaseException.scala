/*
 * Copyright (C) 2019 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.coordination.lease

import akka.annotation.ApiMayChange

@ApiMayChange
class LeaseException(message: String) extends RuntimeException(message)

@ApiMayChange
class LeaseTimeoutException(message: String) extends LeaseException(message)
