package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.BookWindow;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWin = (BookWindow) ob;
		nonEmptyRule();
		isbnDigitCountRule();
		priceFloatRule();
		priceLowerLimitRule();
	}
	private void nonEmptyRule() throws RuleException{
		if(bookWin.getIsbnValue().trim().isEmpty() ||
				bookWin.getTitleValue().trim().isEmpty() ||
				bookWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	private void isbnDigitCountRule() throws RuleException {
		String isbn = bookWin.getIsbnValue().trim();
		if(!Util.isInteger(isbn)) throw new RuleException("Isbn must be numeric!");
		if(isbn.length()!=10 && isbn.length()!=13)
			throw new RuleException("Isbn must consist of either 10 or 13 characters!");
		if(isbn.length()==10 && isbn.charAt(0)!='0' && isbn.charAt(0)!='1')
			throw new RuleException("the first digit must be 0 or 1");
		if(isbn.length()==13 && isbn.substring(0, 3)!="978" && isbn.substring(0, 3)!="979")
			throw new RuleException("the first 3 digits must be either 978 or 979");
	}
	private void priceFloatRule() throws RuleException {
		String price = bookWin.getPriceValue().trim();
		if(!Util.isFloat(price) ) {
			throw new RuleException("Price must be floating point number with two decimal places!");
		}
	}
	private void priceLowerLimitRule() throws RuleException {
		String price = bookWin.getPriceValue().trim();
		if(Util.isFloat(price) && Float.parseFloat(price) <= 0.49f ) {
			throw new RuleException("Price must be a number greater than 0.49!");
		}
	}

}
