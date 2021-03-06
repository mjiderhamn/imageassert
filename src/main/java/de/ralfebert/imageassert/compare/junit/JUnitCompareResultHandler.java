package de.ralfebert.imageassert.compare.junit;

import org.junit.Assert;

import de.ralfebert.imageassert.compare.ICompareResultHandler;
import de.ralfebert.imageassert.compare.Page;

public class JUnitCompareResultHandler implements ICompareResultHandler {

	public void onImageNotEqual(Page expected, Page actual) {
		Assert.fail(String.format("Expected: %s, actual: %s", expected.getName(), actual.getName()));
	}

}
