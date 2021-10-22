package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWin;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWin = (CDWindow) ob;
		nonemptyRule();
		priceFloatRule();
		priceLowerLimitRule();
	}
	private void nonemptyRule() throws RuleException {
		if(cdWin.getArtistValue().trim().isEmpty() ||
				cdWin.getTitleValue().trim().isEmpty() ||
				cdWin.getPriceValue().trim().isEmpty() ) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	private void priceFloatRule() throws RuleException {
		String price = cdWin.getPriceValue().trim();
		if(!Util.isFloat(price) ) {
			throw new RuleException("Price must be floating point number with two decimal places!");
		}
	}
	private void priceLowerLimitRule() throws RuleException {
		String price = cdWin.getPriceValue().trim();
		if(Util.isFloat(price) && Float.parseFloat(price) <= 0.49f ) {
			throw new RuleException("Price must be a number greater than 0.49!");
		}
	}
}
