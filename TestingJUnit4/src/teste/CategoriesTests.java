package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import testscategories.FastTest;
import testscategories.RightTests;

@RunWith(Categories.class)
@IncludeCategory(FastTest.class)
@SuiteClasses({PersoanaTests.class, CompanieFakeSpyTest.class,CompanieFakeTest.class,CompanieMockitoTest.class,CompanieStubTests.class})
public class CategoriesTests {

}
