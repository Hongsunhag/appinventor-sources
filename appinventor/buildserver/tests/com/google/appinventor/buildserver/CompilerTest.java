// Copyright 2009 Google Inc. All Rights Reserved.

package com.google.appinventor.buildserver;

import com.google.common.collect.Sets;

import junit.framework.TestCase;

import java.util.Set;

/**
 * Tests Compiler class.
 *
 */
public class CompilerTest extends TestCase {

  public void testGeneratePermissions() throws Exception {
    Set<String> noComponents = Sets.newHashSet();
    Compiler compiler = new Compiler(null, noComponents, System.out, System.err, System.err, false);
    assertTrue("Permissions for no components not empty. (It should be empty!)",
        compiler.generatePermissions().isEmpty());

    Set<String> componentTypes = Sets.newHashSet("LocationSensor");
    compiler = new Compiler(null, componentTypes, System.out, System.err, System.err, false);
    Set<String> permissions = compiler.generatePermissions();
    assertEquals(4, permissions.size());
    assertTrue(permissions.contains(
        "android.permission.ACCESS_FINE_LOCATION"));
    assertTrue(permissions.contains(
        "android.permission.ACCESS_COARSE_LOCATION"));
    assertTrue(permissions.contains(
        "android.permission.ACCESS_MOCK_LOCATION"));
    assertTrue(permissions.contains(
        "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS"));
  }
}