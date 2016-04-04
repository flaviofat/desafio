package br.com.b2w.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.b2w.core.HellTriangle;

public class HellTriangleTest {

	@Test
	public void hellTriangleFindNumber26(){
		int arrayInput [][] = {{6},{3,5},{9,7,1},{4,6,8,4}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 26);
	}

	@Test
	public void hellTriangleFindNumber28(){
		int arrayInput [][] = {{6},{3,5},{7,9,1},{4,6,8,4}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 28);
	}

	@Test
	public void hellTriangleFindNumber43(){
		int arrayInput [][] = {{10},{8,5},{9,3,1},{6,7,4,8},{3,6,9,8,1}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 43);
	}

	@Test
	public void hellTriangleFindNumber3(){
		int arrayInput [][] = {{1},{1,2}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 3);
	}

	@Test
	public void hellTriangleFindNumber63(){
		int arrayInput [][] = {{10},{8,5},{9,3,1},{6,7,4,8},{3,6,9,8,1},{9,8,10,20,30,40}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 63);
	}
	
	@Test
	public void hellTriangleFindNumber1063(){
		int arrayInput [][] = {{10},{8,5},{9,3,1},{6,7,4,8},{3,6,9,8,1},{9,8,10,20,30,40},{1000,2000,9000,1000,11,12,989}};

		HellTriangle hellTriangle = new HellTriangle();
		int result = hellTriangle.findMaximumTotalTopBottom(arrayInput);

		Assert.assertTrue(result == 1063);
	}
}
