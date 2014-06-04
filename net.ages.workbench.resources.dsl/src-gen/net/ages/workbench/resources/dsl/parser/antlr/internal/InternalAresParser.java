package net.ages.workbench.resources.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.ages.workbench.resources.dsl.services.AresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAresParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A_Resource_Whose_Name = '", "'.'", "'='", "'\\\\'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalAresParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAresParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAresParser.tokenNames; }
    public String getGrammarFileName() { return "../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g"; }



     	private AresGrammarAccess grammarAccess;
     	
        public InternalAresParser(TokenStream input, AresGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AresModel";	
       	}
       	
       	@Override
       	protected AresGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAresModel"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:67:1: entryRuleAresModel returns [EObject current=null] : iv_ruleAresModel= ruleAresModel EOF ;
    public final EObject entryRuleAresModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAresModel = null;


        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:68:2: (iv_ruleAresModel= ruleAresModel EOF )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:69:2: iv_ruleAresModel= ruleAresModel EOF
            {
             newCompositeNode(grammarAccess.getAresModelRule()); 
            pushFollow(FOLLOW_ruleAresModel_in_entryRuleAresModel75);
            iv_ruleAresModel=ruleAresModel();

            state._fsp--;

             current =iv_ruleAresModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAresModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAresModel"


    // $ANTLR start "ruleAresModel"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:76:1: ruleAresModel returns [EObject current=null] : (otherlv_0= 'A_Resource_Whose_Name = ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )* ) ;
    public final EObject ruleAresModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dsl_Model_definitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:79:28: ( (otherlv_0= 'A_Resource_Whose_Name = ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )* ) )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:80:1: (otherlv_0= 'A_Resource_Whose_Name = ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )* )
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:80:1: (otherlv_0= 'A_Resource_Whose_Name = ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )* )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:80:3: otherlv_0= 'A_Resource_Whose_Name = ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAresModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAresModelAccess().getA_Resource_Whose_NameKeyword_0());
                
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:86:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAresModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAresModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAresModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:102:2: ( (lv_dsl_Model_definitions_2_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:103:1: (lv_dsl_Model_definitions_2_0= ruleDefinition )
            	    {
            	    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:103:1: (lv_dsl_Model_definitions_2_0= ruleDefinition )
            	    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:104:3: lv_dsl_Model_definitions_2_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAresModelAccess().getDsl_Model_definitionsDefinitionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleAresModel164);
            	    lv_dsl_Model_definitions_2_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAresModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Model_definitions",
            	            		lv_dsl_Model_definitions_2_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAresModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:128:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:129:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:130:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName202);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:137:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:140:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:141:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:141:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:141:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName253); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:148:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:149:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName272); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName287); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDefinition"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:169:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:170:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:171:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition334);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:178:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )? ( ( ruleQualifiedName ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_dsl_Definition_Text_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:181:28: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )? ( ( ruleQualifiedName ) )? ) )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:182:1: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )? ( ( ruleQualifiedName ) )? )
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:182:1: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )? ( ( ruleQualifiedName ) )? )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:182:2: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )? ( ( ruleQualifiedName ) )?
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:182:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:183:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:183:1: (lv_name_0_0= ruleQualifiedName )
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:184:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDefinition390);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDefinition402); 

                	newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:204:1: ( ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:204:2: ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) ) (otherlv_3= '\\\\' )*
                    {
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:204:2: ( (lv_dsl_Definition_Text_2_0= RULE_STRING ) )
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:205:1: (lv_dsl_Definition_Text_2_0= RULE_STRING )
                    {
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:205:1: (lv_dsl_Definition_Text_2_0= RULE_STRING )
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:206:3: lv_dsl_Definition_Text_2_0= RULE_STRING
                    {
                    lv_dsl_Definition_Text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition420); 

                    			newLeafNode(lv_dsl_Definition_Text_2_0, grammarAccess.getDefinitionAccess().getDsl_Definition_TextSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dsl_Definition_Text",
                            		lv_dsl_Definition_Text_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:222:2: (otherlv_3= '\\\\' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:222:4: otherlv_3= '\\\\'
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDefinition438); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getReverseSolidusKeyword_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:226:5: ( ( ruleQualifiedName ) )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:227:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:227:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.resources.dsl/src-gen/net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.g:228:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getDsl_Definition_RefDefinitionCrossReference_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDefinition465);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\2\1\4\3\uffff\1\4";
    static final String DFA5_minS =
        "\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA5_maxS =
        "\1\4\1\15\1\uffff\1\4\1\uffff\1\15";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\4\7\uffff\1\3\1\2",
            "",
            "\1\5",
            "",
            "\1\4\7\uffff\1\3\1\2"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "226:5: ( ( ruleQualifiedName ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleAresModel_in_entryRuleAresModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAresModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAresModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAresModel143 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleAresModel164 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName253 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName287 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDefinition390 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefinition402 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition420 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_14_in_ruleDefinition438 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDefinition465 = new BitSet(new long[]{0x0000000000000002L});

}