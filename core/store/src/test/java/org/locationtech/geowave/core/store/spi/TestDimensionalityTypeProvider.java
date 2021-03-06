/**
 * Copyright (c) 2013-2020 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store.spi;

import org.locationtech.geowave.core.store.api.Index;

public class TestDimensionalityTypeProvider implements DimensionalityTypeProviderSpi {

  @Override
  public String getDimensionalityTypeName() {
    return "test";
  }

  @Override
  public String getDimensionalityTypeDescription() {
    return null;
  }

  @Override
  public Index createIndex(final DimensionalityTypeOptions options) {
    return null;
  }

  @Override
  public DimensionalityTypeOptions createOptions() {
    return null;
  }
}
