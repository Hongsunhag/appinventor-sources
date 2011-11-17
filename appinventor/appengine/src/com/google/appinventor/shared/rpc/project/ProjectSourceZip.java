// Copyright 2011 Google Inc. All Rights Reserved.

package com.google.appinventor.shared.rpc.project;

/**
 * Encapsulates a {@link RawFile} and a count of the number of
 * files contained within.
 *
 */
public class ProjectSourceZip {
  private RawFile rawFile;
  private int fileCount;

  /**
   * Creates new raw zip file.
   *
   * @param rawFile encapsulation of the file name and contents
   * @param fileCount the number of files in the zip file
   */
  public ProjectSourceZip(RawFile rawFile, int fileCount) {
    this.rawFile = rawFile;
    this.fileCount = fileCount;
  }

  /**
   * Creates new raw zip file.
   *
   * @param fileName file name
   * @param content file content
   * @param fileCount number of files in the zip file
   */
  public ProjectSourceZip(String fileName, byte[] content, int fileCount) {
    this(new RawFile(fileName, content), fileCount);
  }

  /**
   * Returns the encapsulated file (name and content).
   *
   * @return the encapsulated file
   */
  public RawFile getRawFile() {
    return rawFile;
  }

  /**
   * Returns file name.
   *
   * @return file name
   */
  public String getFileName() {
    return rawFile.getFileName();
  }

  /**
   * Returns file content.
   *
   * @return file content
   */
  public byte[] getContent() {
    return rawFile.getContent();
  }

  /**
   * Returns count of number of files in this zip file
   *
   * @return file count
   */
  public int getFileCount() {
    return fileCount;
  }
}