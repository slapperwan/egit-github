/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.eclipse.egit.github.core.util.DateUtils;

/**
 * Release model class
 */
public class Release implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 6554996867712735406L;

	private int id;

	private String tagName;

	private String name;

	private String body;

	private boolean draft;

	private boolean prerelease;

	private Date createdAt;

	private Date publishedAt;

	private User author;

	private List<Download> assets;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this download
	 */
	public Release setId(int id) {
		this.id = id;
		return this;
	}

	/**
	 * @return tagName
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * @param tagName
	 * @return this release
	 */
	public Release setTagName(String tagName) {
		this.tagName = tagName;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this release
	 */
	public Release setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return author
	 */
	public User getAuthor() {
		return author;
	}

	/**
	 * @param author
	 * @return this release
	 */
	public Release setAuthor(User author) {
	    this.author = author;
	    return this;
	}

	/**
	 * @return body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 * @return this release
	 */
	public Release setBody(String body) {
		this.body = body;
		return this;
	}

	/**
	 * @return draft
	 */
	public boolean isDraft() {
	    return draft;
	}

	/**
	 * @param draft
	 * @return this release
	 */
	public Release setDraft(boolean draft) {
	    this.draft = draft;
	    return this;
	}

	/**
	 * @return prerelease
	 */
	public boolean isPreRelease() {
	    return prerelease;
	}

	/**
	 * @param prerelease
	 * @return this release
	 */
	public Release setPreRelease(boolean prerelease) {
	    this.prerelease = prerelease;
	    return this;
	}

	/**
	 * @return creation date
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this release
	 */
	public Release setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return publish date
	 */
	public Date getPublishedAt() {
		return DateUtils.clone(publishedAt);
	}

	/**
	 * @param publishedAt
	 * @return this release
	 */
	public Release setPublishedAt(Date publishedAt) {
		this.publishedAt = DateUtils.clone(publishedAt);
		return this;
	}

	/**
	 * @return assets
	 */
	public List<Download> getAssets() {
	    return assets;
	}

	/**
	 * @param assets
	 * @return this release
	 */
	public Release setAssets(List<Download> assets) {
	    this.assets = assets;
	    return this;
	}
}
