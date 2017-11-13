package net.ages.workbench.resources.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.ages.workbench.resources.dsl.services.AresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAresParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g"; }


     
     	private AresGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AresGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAresModel"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:60:1: entryRuleAresModel : ruleAresModel EOF ;
    public final void entryRuleAresModel() throws RecognitionException {
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:61:1: ( ruleAresModel EOF )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:62:1: ruleAresModel EOF
            {
             before(grammarAccess.getAresModelRule()); 
            pushFollow(FOLLOW_ruleAresModel_in_entryRuleAresModel61);
            ruleAresModel();

            state._fsp--;

             after(grammarAccess.getAresModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAresModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAresModel"


    // $ANTLR start "ruleAresModel"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:69:1: ruleAresModel : ( ( rule__AresModel__Group__0 ) ) ;
    public final void ruleAresModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:73:2: ( ( ( rule__AresModel__Group__0 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:74:1: ( ( rule__AresModel__Group__0 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:74:1: ( ( rule__AresModel__Group__0 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:75:1: ( rule__AresModel__Group__0 )
            {
             before(grammarAccess.getAresModelAccess().getGroup()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:76:1: ( rule__AresModel__Group__0 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:76:2: rule__AresModel__Group__0
            {
            pushFollow(FOLLOW_rule__AresModel__Group__0_in_ruleAresModel94);
            rule__AresModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAresModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAresModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:89:1: ( ruleQualifiedName EOF )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDefinition"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:116:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:117:1: ( ruleDefinition EOF )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:118:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition181);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:125:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:129:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:130:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:130:1: ( ( rule__Definition__Group__0 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:131:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:132:1: ( rule__Definition__Group__0 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:132:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition214);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "rule__AresModel__Group__0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:146:1: rule__AresModel__Group__0 : rule__AresModel__Group__0__Impl rule__AresModel__Group__1 ;
    public final void rule__AresModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:150:1: ( rule__AresModel__Group__0__Impl rule__AresModel__Group__1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:151:2: rule__AresModel__Group__0__Impl rule__AresModel__Group__1
            {
            pushFollow(FOLLOW_rule__AresModel__Group__0__Impl_in_rule__AresModel__Group__0248);
            rule__AresModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AresModel__Group__1_in_rule__AresModel__Group__0251);
            rule__AresModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__0"


    // $ANTLR start "rule__AresModel__Group__0__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:158:1: rule__AresModel__Group__0__Impl : ( 'A_Resource_Whose_Name = ' ) ;
    public final void rule__AresModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:162:1: ( ( 'A_Resource_Whose_Name = ' ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:163:1: ( 'A_Resource_Whose_Name = ' )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:163:1: ( 'A_Resource_Whose_Name = ' )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:164:1: 'A_Resource_Whose_Name = '
            {
             before(grammarAccess.getAresModelAccess().getA_Resource_Whose_NameKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__AresModel__Group__0__Impl279); 
             after(grammarAccess.getAresModelAccess().getA_Resource_Whose_NameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__0__Impl"


    // $ANTLR start "rule__AresModel__Group__1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:177:1: rule__AresModel__Group__1 : rule__AresModel__Group__1__Impl rule__AresModel__Group__2 ;
    public final void rule__AresModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:181:1: ( rule__AresModel__Group__1__Impl rule__AresModel__Group__2 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:182:2: rule__AresModel__Group__1__Impl rule__AresModel__Group__2
            {
            pushFollow(FOLLOW_rule__AresModel__Group__1__Impl_in_rule__AresModel__Group__1310);
            rule__AresModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AresModel__Group__2_in_rule__AresModel__Group__1313);
            rule__AresModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__1"


    // $ANTLR start "rule__AresModel__Group__1__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:189:1: rule__AresModel__Group__1__Impl : ( ( rule__AresModel__NameAssignment_1 ) ) ;
    public final void rule__AresModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:193:1: ( ( ( rule__AresModel__NameAssignment_1 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:194:1: ( ( rule__AresModel__NameAssignment_1 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:194:1: ( ( rule__AresModel__NameAssignment_1 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:195:1: ( rule__AresModel__NameAssignment_1 )
            {
             before(grammarAccess.getAresModelAccess().getNameAssignment_1()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:196:1: ( rule__AresModel__NameAssignment_1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:196:2: rule__AresModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AresModel__NameAssignment_1_in_rule__AresModel__Group__1__Impl340);
            rule__AresModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAresModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__1__Impl"


    // $ANTLR start "rule__AresModel__Group__2"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:206:1: rule__AresModel__Group__2 : rule__AresModel__Group__2__Impl ;
    public final void rule__AresModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:210:1: ( rule__AresModel__Group__2__Impl )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:211:2: rule__AresModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AresModel__Group__2__Impl_in_rule__AresModel__Group__2370);
            rule__AresModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__2"


    // $ANTLR start "rule__AresModel__Group__2__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:217:1: rule__AresModel__Group__2__Impl : ( ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )* ) ;
    public final void rule__AresModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:221:1: ( ( ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )* ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:222:1: ( ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )* )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:222:1: ( ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )* )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:223:1: ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )*
            {
             before(grammarAccess.getAresModelAccess().getDsl_Model_definitionsAssignment_2()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:224:1: ( rule__AresModel__Dsl_Model_definitionsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:224:2: rule__AresModel__Dsl_Model_definitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AresModel__Dsl_Model_definitionsAssignment_2_in_rule__AresModel__Group__2__Impl397);
            	    rule__AresModel__Dsl_Model_definitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAresModelAccess().getDsl_Model_definitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:240:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:244:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:245:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0434);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0437);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:252:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:256:1: ( ( RULE_ID ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:257:1: ( RULE_ID )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:257:1: ( RULE_ID )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:258:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl464); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:269:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:273:1: ( rule__QualifiedName__Group__1__Impl )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:274:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1493);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:280:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:284:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:285:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:285:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:286:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:287:1: ( rule__QualifiedName__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:287:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl520);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:301:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:305:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:306:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0555);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0558);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:313:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:317:1: ( ( '.' ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:318:1: ( '.' )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:318:1: ( '.' )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:319:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl586); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:332:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:336:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:337:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1617);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:343:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:347:1: ( ( RULE_ID ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:348:1: ( RULE_ID )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:348:1: ( RULE_ID )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:349:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl644); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:364:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:368:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:369:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0677);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0680);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:376:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__NameAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:380:1: ( ( ( rule__Definition__NameAssignment_0 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:381:1: ( ( rule__Definition__NameAssignment_0 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:381:1: ( ( rule__Definition__NameAssignment_0 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:382:1: ( rule__Definition__NameAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:383:1: ( rule__Definition__NameAssignment_0 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:383:2: rule__Definition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl707);
            rule__Definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:393:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:397:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:398:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1737);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1740);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:405:1: rule__Definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:409:1: ( ( '=' ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:410:1: ( '=' )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:410:1: ( '=' )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:411:1: '='
            {
             before(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Definition__Group__1__Impl768); 
             after(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:424:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:428:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:429:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2799);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2802);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:436:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:440:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:441:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:441:1: ( ( rule__Definition__Group_2__0 )? )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:442:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:443:1: ( rule__Definition__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:443:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl829);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:453:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:457:1: ( rule__Definition__Group__3__Impl )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:458:2: rule__Definition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3860);
            rule__Definition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:464:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__Dsl_Definition_RefAssignment_3 )? ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:468:1: ( ( ( rule__Definition__Dsl_Definition_RefAssignment_3 )? ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:469:1: ( ( rule__Definition__Dsl_Definition_RefAssignment_3 )? )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:469:1: ( ( rule__Definition__Dsl_Definition_RefAssignment_3 )? )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:470:1: ( rule__Definition__Dsl_Definition_RefAssignment_3 )?
            {
             before(grammarAccess.getDefinitionAccess().getDsl_Definition_RefAssignment_3()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:471:1: ( rule__Definition__Dsl_Definition_RefAssignment_3 )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:471:2: rule__Definition__Dsl_Definition_RefAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Definition__Dsl_Definition_RefAssignment_3_in_rule__Definition__Group__3__Impl887);
                    rule__Definition__Dsl_Definition_RefAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getDsl_Definition_RefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:489:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:493:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:494:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__0926);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__0929);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:501:1: rule__Definition__Group_2__0__Impl : ( ( rule__Definition__Dsl_Definition_TextAssignment_2_0 ) ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:505:1: ( ( ( rule__Definition__Dsl_Definition_TextAssignment_2_0 ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:506:1: ( ( rule__Definition__Dsl_Definition_TextAssignment_2_0 ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:506:1: ( ( rule__Definition__Dsl_Definition_TextAssignment_2_0 ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:507:1: ( rule__Definition__Dsl_Definition_TextAssignment_2_0 )
            {
             before(grammarAccess.getDefinitionAccess().getDsl_Definition_TextAssignment_2_0()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:508:1: ( rule__Definition__Dsl_Definition_TextAssignment_2_0 )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:508:2: rule__Definition__Dsl_Definition_TextAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Definition__Dsl_Definition_TextAssignment_2_0_in_rule__Definition__Group_2__0__Impl956);
            rule__Definition__Dsl_Definition_TextAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDsl_Definition_TextAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:518:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:522:1: ( rule__Definition__Group_2__1__Impl )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:523:2: rule__Definition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__1986);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:529:1: rule__Definition__Group_2__1__Impl : ( ( '\\\\' )* ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:533:1: ( ( ( '\\\\' )* ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:534:1: ( ( '\\\\' )* )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:534:1: ( ( '\\\\' )* )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:535:1: ( '\\\\' )*
            {
             before(grammarAccess.getDefinitionAccess().getReverseSolidusKeyword_2_1()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:536:1: ( '\\\\' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:537:2: '\\\\'
            	    {
            	    match(input,14,FOLLOW_14_in_rule__Definition__Group_2__1__Impl1015); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getReverseSolidusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__AresModel__NameAssignment_1"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:553:1: rule__AresModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AresModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:557:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:558:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:558:1: ( ruleQualifiedName )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:559:1: ruleQualifiedName
            {
             before(grammarAccess.getAresModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AresModel__NameAssignment_11057);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAresModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__NameAssignment_1"


    // $ANTLR start "rule__AresModel__Dsl_Model_definitionsAssignment_2"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:568:1: rule__AresModel__Dsl_Model_definitionsAssignment_2 : ( ruleDefinition ) ;
    public final void rule__AresModel__Dsl_Model_definitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:572:1: ( ( ruleDefinition ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:573:1: ( ruleDefinition )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:573:1: ( ruleDefinition )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:574:1: ruleDefinition
            {
             before(grammarAccess.getAresModelAccess().getDsl_Model_definitionsDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__AresModel__Dsl_Model_definitionsAssignment_21088);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getAresModelAccess().getDsl_Model_definitionsDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AresModel__Dsl_Model_definitionsAssignment_2"


    // $ANTLR start "rule__Definition__NameAssignment_0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:583:1: rule__Definition__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:587:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:588:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:588:1: ( ruleQualifiedName )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:589:1: ruleQualifiedName
            {
             before(grammarAccess.getDefinitionAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Definition__NameAssignment_01119);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_0"


    // $ANTLR start "rule__Definition__Dsl_Definition_TextAssignment_2_0"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:598:1: rule__Definition__Dsl_Definition_TextAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Definition__Dsl_Definition_TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:602:1: ( ( RULE_STRING ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:603:1: ( RULE_STRING )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:603:1: ( RULE_STRING )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:604:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDsl_Definition_TextSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__Dsl_Definition_TextAssignment_2_01150); 
             after(grammarAccess.getDefinitionAccess().getDsl_Definition_TextSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Dsl_Definition_TextAssignment_2_0"


    // $ANTLR start "rule__Definition__Dsl_Definition_RefAssignment_3"
    // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:613:1: rule__Definition__Dsl_Definition_RefAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Definition__Dsl_Definition_RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:617:1: ( ( ( ruleQualifiedName ) ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:618:1: ( ( ruleQualifiedName ) )
            {
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:618:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:619:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDefinitionAccess().getDsl_Definition_RefDefinitionCrossReference_3_0()); 
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:620:1: ( ruleQualifiedName )
            // ../net.ages.workbench.resources.dsl.ui/src-gen/net/ages/workbench/resources/dsl/ui/contentassist/antlr/internal/InternalAres.g:621:1: ruleQualifiedName
            {
             before(grammarAccess.getDefinitionAccess().getDsl_Definition_RefDefinitionQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Definition__Dsl_Definition_RefAssignment_31185);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getDsl_Definition_RefDefinitionQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getDsl_Definition_RefDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Dsl_Definition_RefAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff";
    static final String DFA4_eofS =
        "\1\2\1\4\3\uffff\1\4";
    static final String DFA4_minS =
        "\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA4_maxS =
        "\1\4\1\15\1\uffff\1\4\1\uffff\1\15";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA4_specialS =
        "\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\4\7\uffff\1\3\1\2",
            "",
            "\1\5",
            "",
            "\1\4\7\uffff\1\3\1\2"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "471:1: ( rule__Definition__Dsl_Definition_RefAssignment_3 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleAresModel_in_entryRuleAresModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAresModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__Group__0_in_ruleAresModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__Group__0__Impl_in_rule__AresModel__Group__0248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AresModel__Group__1_in_rule__AresModel__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AresModel__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__Group__1__Impl_in_rule__AresModel__Group__1310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AresModel__Group__2_in_rule__AresModel__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__NameAssignment_1_in_rule__AresModel__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__Group__2__Impl_in_rule__AresModel__Group__2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AresModel__Dsl_Model_definitionsAssignment_2_in_rule__AresModel__Group__2__Impl397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0434 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl520 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1737 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Definition__Group__1__Impl768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2799 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Dsl_Definition_RefAssignment_3_in_rule__Definition__Group__3__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__0926 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__0929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Dsl_Definition_TextAssignment_2_0_in_rule__Definition__Group_2__0__Impl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Definition__Group_2__1__Impl1015 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AresModel__NameAssignment_11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__AresModel__Dsl_Model_definitionsAssignment_21088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Definition__NameAssignment_01119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__Dsl_Definition_TextAssignment_2_01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Definition__Dsl_Definition_RefAssignment_31185 = new BitSet(new long[]{0x0000000000000002L});

}